/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmain;

/**
 *
 * @author User
 */
public class Node {
    
    private Student data;
    private Node next;
	
	
	public Node (Student St) {
            data = St;
	    next = null; }
	
	
	public Student getData() {
            return data; }
	
	
	public void setData(Student St) {
            this.data = St; }
	

	public Node getNext() {
            return next; }

        
	public void setNext(Node next) {
            this.next = next; }
        
}