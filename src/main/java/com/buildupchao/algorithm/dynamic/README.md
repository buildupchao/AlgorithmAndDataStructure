### [Dynamic Programming](https://www.cnblogs.com/wuyuegb2312/p/3281264.html)

> 虽然抽象后进行求解的思路并不复杂，但具体的形式千差万别，找出问题的子结构以及通过子结构重新构造最优解的过程很难统一，并不想回溯法具有解决绝大多数问题的银弹（全面解析回溯法：算法框架与问题求解）。为了解决动态规划问题，只能靠多练习、多思考了。

<br/>
重点：递归方程+边界条件

#### Content

动态规划求解的一般思路

(1) 判断问题的子结构（也可看作状态），当具有最优子结构时，动态规划可能适用。<br/>
(2) 求解重叠子问题。一个递归算法不断地调用同一问题，递归可以转化为查表从而利用子问题的解。分治法则不同，每次递归都产生新的问题。<br/>
(3) 重新构造一个最优解。<br/>

备忘录法<br/>

(1) 动态规划的一种变形，使用自顶向下的策略，更像递归算法。<br/>
(2) 初始化时表中填入一个特殊值表示待填入，当递归算法第一次遇到一个子问题时，计算并填表；以后每次遇到时只需返回以前填入的值。<br/>
(3) 实例可以参照矩阵链乘法部分。<br/>

- 1.硬币找零
  	- 扩展1：单路取苹果
  	- 扩展2：装配线调度
  
- 2.字符串相似度/编辑距离（edit distance）
	- 应用1：子串匹配
	- 应用2：最长公共子序列
- 3.最长公共子序列（Longest Common Subsequence, lcs）
	- 扩展1：输出所有lcs
	- 扩展2：通过LCS获得最长递增子序列
- 4.最长递增子序列（Longest Increasing Subsequence, lis）
	- 扩展：求解lis的加速

- 5.最大连续子序列和/积
	- 扩展1：正浮点数数组求最大连续子序列积
	- 扩展2：任意浮点数数组求最大连续子序列积
	
- 6.矩阵链乘法
	- 扩展：矩阵链乘法的备忘录解法（伪码）

- 7.0-1背包问题

- 8.有代价的最短路径

- 9.瓷砖覆盖（状态压缩DP）

- 10.工作量划分

- 11.三路取苹果

#### Reference Link

- [附录1:其他的一些动态规划问题与解答](https://www.cnblogs.com/wuyuegb2312/p/3281264.html#a1)

- [附录2:《算法设计手册》第八章 动态规划 面试题解答](https://www.cnblogs.com/wuyuegb2312/p/3281264.html#a2)