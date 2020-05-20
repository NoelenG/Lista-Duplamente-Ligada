package br.noelen;

public class No {
    private String name;
    private No next;
    private No previous;

    public No(String name){
        this.name = name;
        this.next = null;
        this.previous = null;
    }

    public String getName(){
        return name;
    }

    public No getNext(){
        return next;
    }

    public void setNext(No next){
        this.next = next;
    }
    
    @Override
    public String toString() {
        return "name:" + name + ";";
    }

	public No getPrevious() {
		return previous;
	}

	public void setPrevious(No previous) {
		this.previous = previous;
	}

    
}
