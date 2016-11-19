package TWIN_PEAKS;

import java.util.ArrayList;

public class Posse{
	ArrayList<String> posse = new ArrayList<String>();
	
	public void addMember(String member1){
		posse.add(member1);}
	
	public void removeMember(){
		posse.remove(-1);}
	
	public ArrayList<String> thePosse(){
		return posse;}}

