# Leetcode
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
