/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmain;

/**
 *
 * @author User
 */
public class Queue {
    
     private Node front;
    private Node rear;
    
    
    public Queue(){
    
        front = null;
        rear = null; }
        

    public void enqueue(Student St){
        Node pp = new Node(St);
        if (front == null){
            front = pp;
            rear = pp; }
        
        else {
            rear.setNext(pp);
            rear = pp; } 
    }
    
    
    public Student dequeue() {

        if(front == null) {
            System.out.println("Queue is empty!");
            return null; }
            
        Student temp = front.getData();
        Node ss = front;
        front = front.getNext();
        ss.setNext(null);
        return temp; }
    
    
    public int size() {
        int count = 0;
        Node ss = front;
        
        while (ss != null) {
            count++;
            ss = ss.getNext(); }
        
        return count; }
    
    
    public Student front() { 
        if (front == null) {
            System.out.println("Queue is empty!");
            return null; }
        
        return front.getData(); }
    
    
    public boolean isEmpty() {
        return (front == null); }
    
    
    public void display_Queue (){
        Node ss = front;
        
        if (ss == null) {
        System.out.println("The queue is empty.");
        return; }
    
        while (ss != null){
            System.out.println("name: " + ss.getData().getName() + " ,Gender: " + ss.getData().getGender() + " ,Id: " + ss.getData().getID() + " ,Age: " + ss.getData().getAge());
            ss = ss.getNext();
        }
    }
    
    public Stack QtoS(Queue Q1){
        Stack S1 = new Stack();
        
        for(int i = 1; i <= Q1.size(); i++){
            Student temp = Q1.dequeue();
            S1.push(temp);
            Q1.enqueue(temp);
        }
        return S1;
    }
    
    public Stack EvenQtoS(Queue Q1){
        Stack S1 = new Stack();
        
        for(int i = 1; i <= Q1.size(); i++){
            Student temp = Q1.dequeue();
            if(temp.getAge() % 2 == 0){
                S1.push(temp);
            }
            Q1.enqueue(temp);
        }
        return S1;
    }
    
    public Stack DeleteS(Stack S1){
        while(!S1.isEmpty()){
            Student temp = S1.pop();
        }
        return S1;
    }
}