<h2><a href="https://practice.geeksforgeeks.org/problems/delete-array-elements-which-are-smaller-than-next-or-become-smaller3115/1?page=2&difficulty[]=-1&difficulty[]=0&category[]=Stack&sortBy=submissions">Delete array elements which are smaller than next or become smaller</a></h2><h3>Difficulty Level : Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array arr[] and a number k. The task is to delete <strong>k</strong> elements which are smaller than next element (i.e., we delete arr[i] if arr[i] &lt; arr[i+1]) or become smaller than next because next element is deleted.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>â€‹Input :</strong> arr[ ] = {20, 10, 25, 30, 40} 
        and K = 2
<strong>Output :</strong> 25 30 40
<strong>Explanation:</strong>
First we delete 10 because it follows&nbsp;
arr[i] &lt; arr[i+1]. Then we delete 20 
because 25 is moved next to it and it 
also starts following the condition.
</span></pre>

<p><br>
<span style="font-size:18px"><strong>â€‹Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input :</strong> arr[ ] = {3, 100, 1} and K = 1<strong>
Output :</strong>  100 1 </span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function <strong>deleteElement()</strong> that takes an array <strong>(arr)</strong>, sizeOfArray <strong>(n)</strong>, an integer <strong>K</strong> and return the array arr[] after deleting the k elements from the array if possible, else print the left array as it is. The driver code takes care of the printing.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N).<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(N).</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
2 ≤ N ≤ 10<sup>5</sup><br>
1 ≤ K &lt;&nbsp;N&nbsp;</span></p>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Stack</code>&nbsp;<code>CPP</code>&nbsp;<code>STL</code>&nbsp;<code>Data Structures</code>&nbsp;