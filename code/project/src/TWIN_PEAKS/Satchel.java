package TWIN_PEAKS;
import java.util.ArrayList;

public class Satchel{
	
	ArrayList<String> satchelList = new ArrayList<String>();
			
	public void addItem(String item1){
		satchelList.add(item1);}
	
	public void removeItem(){
		satchelList.remove(0);}
	
	public ArrayList<String> inventory(){
		return satchelList;}}
