package storage;

public class Book implements ToBeStored{
    private String writter;
    private String name;
    private double weight;
    
    public Book(String writter,String name,double weight){
        this.writter = writter;
        this.name = name;
        this.weight = weight;}
    
    public double weight(){
        return weight;}
    
    public String toString(){
        return writter + ": " + name;}
}
