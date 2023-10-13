<h2><a href="https://practice.geeksforgeeks.org/problems/doubling-the-value4859/1?page=1&difficulty[]=-1&category[]=Sorting&category[]=Searching&category[]=Binary%20Search&sortBy=submissions">Doubling the value</a></h2><h3>Difficulty Level : Basic</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array and an integer B, traverse the array (from the beginning) and if the element in array is B, double B&nbsp;and continue traversal. Find the value of B after the complete traversal.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 5, B = 2
arr[] = {1 2 3 4 8}
<strong>Output:</strong> 16
<strong>Explanation</strong>: B is initially 2. We get 2 at
the 1st index, hence B becomes 4. 
Next, we get B at the 3rd index, hence B 
becomes 8. Next, we get B at 4-th index, 
hence B becomes 16.</span>
</pre>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 5, B = 3
arr[] = {1 2 3 4 8}
<strong>Output:</strong> 6
<strong>Explanation</strong>: B is initially 3. We get 3 at
the 2nd index, hence B becomes 6.</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>solve ()&nbsp;</strong>which takes the array arr[], its size N and an integer B as inputs and returns the final value of B after the complete traversal of the array.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(N).<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(1).</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1&lt;=N&lt;=50<br>
1&lt;=B&lt;=1000<br>
1&lt;=arr[i]&lt;=10<sup>18</sup></span></p>
</div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Flipkart</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Searching</code>&nbsp;<code>Algorithms</code>&nbsp;