/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmain;

/**
 *
 * @author User
 */
public class Stack {
    private Node top;
    
    public Stack(){
        top = null;
    }
    
    public void push(Student St) {
        Node pp = new Node(St);
        if(top == null)
            top = pp;
        else {
            pp.setNext(top);
            top = pp; }
    }
    
    
    public Student pop() {
        if (top == null ) {
            System.out.println("Stack is empty!");
            return null; }

        Student temp = top.getData();
        Node ss = top;
        top = top.getNext();
        ss.setNext(null);
        return temp; }
    
    
    public Student top() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return null; }
            
        return top.getData(); }
    
    
    public boolean isEmpty() {
        return (top == null); }
    
    
    public int size() {
        int count = 0;
        Node ss = top;
        while (ss != null) {
            count++;
            ss = ss.getNext();
        }
        return count; }
    
    public void display() {
        Node ss = top;
        
        if (ss == null) {
        System.out.println("The stack is empty.");
        return; }
    
        while(ss != null){
            System.out.println("name: " + ss.getData().getName() + " ,Gender: " + ss.getData().getGender() + " ,Id: " + ss.getData().getID() + " ,Age: " + ss.getData().getAge());
            ss = ss.getNext();
        }
    }
    
    public Queue StoQ(Stack S1){
        Queue Q1 = new Queue();
        Stack Stemp = new Stack();
        
        while(!S1.isEmpty()){
            Student temp = S1.pop();
            Q1.enqueue(temp);
            Stemp.push(temp);
        }
        
        while(!Stemp.isEmpty()){
            S1.push(Stemp.pop());
        }
        return Q1;
    }
    
    public Queue EvenStoQ(Stack S1){
        Queue Q1 = new Queue();
        Stack Stemp = new Stack();
        
        while(!S1.isEmpty()){
            Student temp = S1.pop();
            if(temp.getAge() % 2 == 0){
                Q1.enqueue(temp);
            }
            Stemp.push(temp);
        }
        
        while(!Stemp.isEmpty()){
            S1.push(Stemp.pop());
        }
        return Q1;
        
    }
    
    public Queue DeleteQ(Queue Q1){
        while(!Q1.isEmpty()){
            Student temp = Q1.dequeue();
        }
        return Q1;
    }
}

