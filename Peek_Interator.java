// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    private final Iterator<Integer> iterator;
    private boolean hasPeek;
    private Integer peekElement;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        this.iterator=iterator;
        hasPeek=false;
        peekElement=null;
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(!hasPeek){
            peekElement=iterator.next();
            hasPeek=true;
        }
        return peekElement;
        
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    if(hasPeek){
            hasPeek=false;
            return peekElement;
        }else{
            return iterator.next();
        }
	}
	
	@Override
	public boolean hasNext() {
	    return hasPeek || iterator.hasNext();
	}
}
