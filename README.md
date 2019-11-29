# Assignment 3(Cisc.3130-my9)
 
The goal of this program is to count the unique appearances of words within a song. 

To solve this problem, I decided to read the song lyrics into a [HashMap](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html) to organize the data. I then incremented the value (appearance of a word) associated with a key (word). I included an if statement to check whether the word exist in the hashmap, if it did then I added 1 to the current value associated with the key.
The [lyrics](https://genius.com/Tt-take-one-lyrics) I decided to use for this assignment are Theresa Wayman's "Take One" I obtained from genius.com


#####Sample Input & Output

Running code:

```
if(!data.containsKey(word)) {
		data.put(word,0);
		value = (int)data.get(word);
		value++;
		data.replace(word, value);
```
Input:

```
And so I feel open, let's go
I can be myself, I can be myself
```

Output:

```
i:        19  
less:     1   
kept:     3   
```

