<h2><a href="https://leetcode.com/problems/unique-paths/">62. Unique Paths</a></h2><h3>Medium</h3><hr><div><p><nr-sentence class="nr-s0" id="nr-s0" page="0">There is a robot on an </nr-sentence><code><nr-sentence class="nr-s0" id="nr-s0" page="0">m x n</nr-sentence></code><nr-sentence class="nr-s0" id="nr-s0" page="0"> grid.</nr-sentence><nr-sentence class="nr-s1" id="nr-s1" page="0"> The robot is initially <nr-word class="nr-s1w4">located</nr-word> at the </nr-sentence><strong><nr-sentence class="nr-s1" id="nr-s1" page="0">top-left corner</nr-sentence></strong><nr-sentence class="nr-s1" id="nr-s1" page="0"> (i.e., </nr-sentence><code><nr-sentence class="nr-s1" id="nr-s1" page="0">grid[0][0]</nr-sentence></code><nr-sentence class="nr-s1" id="nr-s1" page="0">).</nr-sentence><nr-sentence class="nr-s2" id="nr-s2" page="0"> The robot tries to move to the </nr-sentence><strong><nr-sentence class="nr-s2" id="nr-s2" page="0">bottom-right corner</nr-sentence></strong><nr-sentence class="nr-s2" id="nr-s2" page="0"> (i.e., </nr-sentence><code><nr-sentence class="nr-s2" id="nr-s2" page="0">grid[m - 1][n - 1]</nr-sentence></code><nr-sentence class="nr-s2" id="nr-s2" page="0">).</nr-sentence><nr-sentence class="nr-s3" id="nr-s3" page="0"> The robot can only move either down or right at any point in time.</nr-sentence></p>

<p><nr-sentence class="nr-s4" id="nr-s4" page="0">Given the two integers </nr-sentence><code><nr-sentence class="nr-s4" id="nr-s4" page="0">m</nr-sentence></code><nr-sentence class="nr-s4" id="nr-s4" page="0"> and </nr-sentence><code><nr-sentence class="nr-s4" id="nr-s4" page="0">n</nr-sentence></code><nr-sentence class="nr-s4" id="nr-s4" page="0">, return </nr-sentence><em><nr-sentence class="nr-s4" id="nr-s4" page="0">the number of possible unique paths that the robot can take to reach the bottom-right corner</nr-sentence></em><nr-sentence class="nr-s4" id="nr-s4" page="0">.</nr-sentence></p>

<p><nr-sentence class="nr-s5" id="nr-s5" page="0">The test cases are generated so that the answer will be less than or equal to </nr-sentence><code><nr-sentence class="nr-s5" id="nr-s5" page="0">2 * 10</nr-sentence><sup style="">9</sup></code><nr-sentence class="nr-s5" id="nr-s5" page="0">.</nr-sentence></p>

<p>&nbsp;</p>
<p><strong><nr-sentence class="nr-s6" id="nr-s6" page="0">Example 1:</nr-sentence></strong></p>
<img src="https://assets.leetcode.com/uploads/2018/10/22/robot_maze.png" style="width: 400px; height: 183px;">
<pre><strong><nr-sentence class="nr-s7" id="nr-s7" page="0">Input:</nr-sentence></strong><nr-sentence class="nr-s7" id="nr-s7" page="0"> m = 3, n = 7
</nr-sentence><strong><nr-sentence class="nr-s7" id="nr-s7" page="0">Output:</nr-sentence></strong><nr-sentence class="nr-s7" id="nr-s7" page="0"> 28</nr-sentence>
</pre>

<p><strong><nr-sentence class="nr-s8" id="nr-s8" page="0">Example 2:</nr-sentence></strong></p>

<pre><strong><nr-sentence class="nr-s9" id="nr-s9" page="0">Input:</nr-sentence></strong><nr-sentence class="nr-s9" id="nr-s9" page="0"> m = 3, n = 2
</nr-sentence><strong><nr-sentence class="nr-s9" id="nr-s9" page="0">Output:</nr-sentence></strong><nr-sentence class="nr-s9" id="nr-s9" page="0"> 3
</nr-sentence><strong><nr-sentence class="nr-s9" id="nr-s9" page="0">Explanation:</nr-sentence></strong><nr-sentence class="nr-s9" id="nr-s9" page="0"> From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
1.</nr-sentence><nr-sentence class="nr-s10" id="nr-s10" page="0"> Right -&gt; Down -&gt; Down
2.</nr-sentence><nr-sentence class="nr-s11" id="nr-s11" page="0"> Down -&gt; Down -&gt; Right
3.</nr-sentence><nr-sentence class="nr-s12" id="nr-s12" page="0"> Down -&gt; Right -&gt; Down</nr-sentence>
</pre>

<p>&nbsp;</p>
<p><strong><nr-sentence class="nr-s13" id="nr-s13" page="0">Constraints:</nr-sentence></strong></p>

<ul>
	<li><code><nr-sentence class="nr-s14" id="nr-s14" page="0">1 &lt;= m, n &lt;= 100</nr-sentence></code></li>
</ul>
</div>