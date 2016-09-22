package storage;

import java.util.ArrayList;

public class Box implements ToBeStored{
    private double capacity;
    private ArrayList<ToBeStored> content = new ArrayList<ToBeStored>();

    public Box(double weight) {
        this.capacity = weight; }

    public void add(ToBeStored object) {
        if ((object.weight() + this.weight()) <= capacity) {
            content.add(object);} 
        else {
            System.out.println("unable to storage");}}
    
    public String toString(){
        return "Box: " + content.size() + " things, total weight " + this.weight() + " kg";}
    
    public double weight(){
        double weight = 0;
        for(ToBeStored x : content){
            weight += x.weight();}
        return weight;}
}
