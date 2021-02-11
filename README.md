# Leetcode

## 138. Copy List with Random Pointer
- LinkedList (List interface)
- Method for LinkedList: play with first or last element
- addFirst/removeFirst(last)
- get(index)

Hard point:
- how to store the pointer of random
- use HashMap: Map<Node,Node> map = new HashMap();
- follow idea: A -> A' ->B -> B'->C -> C'...

## Peeking Iterator
- Iterator is an object that can be used to loop through clollections like ArrayList.HashSet
-EX: Iterator it = cars.Iterator();  
- next()
- .remove()
- .hasNext()
- create data structure then nomral public class to initialize the element:
class PeekingIterator implements Iterator<Integer> {
    private final Iterator<Integer> iterator;
    private boolean hasPeek;
    private Integer peekElement;
  


	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        this.iterator=iterator;
        hasPeek=false;
        peekElement=null;

## 1347. Minimum Number of Steps to Make Two Strings
- Idea is the point:
- use int[26] to store data to find the number same char

## 515. Find Largest Value in Each Tree Row
- arrayList length or size
- Math.max(a,b)  return bigger value
- break stop that loop || continue oly stop one time
- a binary tree node: each children at most 2; binary recursive struture;
- preorder..



## 937. Reorder Data in Log Files
Q:
1.Different ArrayList array string[] list. 
  - array cant modify the size the of array, so when it change, it need to create a new array
  - ArrayList can add and remove 
    -ArrayList to access a element: list.get(i);
                change a element:   list.set(index,"content");
                use size()
                sort: Collections.sort(list)
                
2.length or ()
  -String: length()
  -array: .length

3.diff .equals() & ==
  -equals: to compare the value of the object
  -==: different addresses in memory
  ex: s1="hi"  s2="hi"
      s1==s2 false
      s1.equals(s2);

Idea:
-spread the arrayList as let & dig
-Override the Collections.sort(let,(o1,o2)->{ ....});    [hard point here]
-put back to logs



## 412. Fizz Buzz
Q:
1.initialize List<String>
  - List<> => ArrayList<>()
2.Integer to String / S to I
  - int y =123;
    String ans = Integer.toString(y);
  
  S to I:
  - String.valueOf(Integer(123));


## 1103. Distribute Candies to People
1.array
int[] ans = new int[number]
**array cant modify the length of array

