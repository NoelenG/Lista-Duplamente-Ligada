package br.noelen;

public class ListaD {
    private No first;
    private No last;

    public ListaD(){
        first = null;
        last = null;
    }

	public Boolean isEmpty() {
		return (first == null);
    }

	public void insertBegin(String name) {
        No newNo = new No(name);
        if(isEmpty()){
            first = newNo;
            last = newNo;
        }else{
            first.setPrevious(newNo);
            newNo.setNext(first);
            first = newNo;
        }
    }

	public String displayForward() {
        String out = "";
		if(isEmpty()){
            return out;
        }else{
            No aux = first;
            while(aux != null){
                out = out + aux.toString();
                aux = aux.getNext();
            }
            return out;
        }
	}

	public void insertLast(String name) {
        No newNo = new No(name);
		if(isEmpty()){
            insertBegin(name);
        }else{
            last.setNext(newNo);
            newNo.setPrevious(last);
            last = newNo;
        }
	}

	public No deleteBegin() {
		if(isEmpty()){
            return null;
        }else{
            No aux = first;
            if(aux.getNext() == null){
                first = last = null;
            }
            No removed = aux;
            first = aux.getNext();
            aux.getNext().setPrevious(null);
            return removed;
        }
    }
    
    public No deleteLast(){
        if(isEmpty()){
            return null;
        }else{
            No aux = first;
            if(aux.getNext() == null){
                first = last = null;
            }
            No removed = last;
            last = aux.getPrevious();
            last.getPrevious().setNext(null);
            return removed;
        }
    }

	
    
    

    
}