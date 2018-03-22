
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class KmerAdjacency {
	private String[] kmerList;
	public KmerAdjacency() {
		this.setKmerList(kmerList);
	}
	
	public HashMap<String,ArrayList> returnAdjacencyList(){
		  Arrays.sort(this.getKmerList());
		  HashMap<String,ArrayList> adjList = new HashMap<String,ArrayList>();
		  for(int i=0 ; i < this.getKmerList().length;i++) {
			  String aKmer = this.getKmerList()[i];
			  ArrayList<String> allAdjKmer = new ArrayList<String>();
			  String firstKMinusOneMer = aKmer.substring(0, aKmer.length()-1);
			  
			  String secondKMinusOneMer = aKmer.substring(1,aKmer.length());
			  System.out.println(firstKMinusOneMer);
			  System.out.println(secondKMinusOneMer);
			  if(adjList.containsKey(firstKMinusOneMer)) {
				  allAdjKmer.add(secondKMinusOneMer);
				  allAdjKmer.addAll(adjList.get(firstKMinusOneMer));
				  adjList.put(firstKMinusOneMer, allAdjKmer);
			  } else {
				  allAdjKmer.add(secondKMinusOneMer);
				  adjList.put(firstKMinusOneMer, allAdjKmer);
			  }
		  }
		return adjList;
	}
	public void printAdjacencyList() {
		HashMap<String,ArrayList> adjList = new HashMap<String,ArrayList>();
		adjList = this.returnAdjacencyList();
		for(String key: adjList.keySet()) {
			ArrayList<String> value = new ArrayList<String>();
			value = adjList.get(key);
			System.out.println(key + ":" +  value);
		}
	}

	public String[] getKmerList() {
		return kmerList;
	}

	public void setKmerList(String[] kmerList) {
		this.kmerList = kmerList;
	}
}
