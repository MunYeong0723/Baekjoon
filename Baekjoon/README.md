# 백준 문제 풀이

<details>
<summary> # 8979 <br> (https://www.acmicpc.net/problem/8979) </summary>
-> 처음에는 Map class를 만들어서 멤버 변수에 key, value를 두고 key에는 국가를 나타내는 정수를, value에는 해당 나라의 메달 개수를 배열로 담는 class를 만들었다. 그리고 main()에서 Map class를 담기 위한 ArrayList를 만들어서 N개 나라의 메달 개수를 담아놓았다.
그리고 Map class에서 compareTo()를 override하여 sorting하려고 하였다. <br>
-> 하지만 이렇게 하면 "1번 국가가 금메달 1개, 은메달 1개를 얻었고, 2번 국가와 3번 국가가 모두 은메달 1개를 얻었으며, 4번 국가는 메달을 얻지 못하였다"라는 경우일 때 2등이 2개의 나라이고 3등은 없는데 이에 대해 처리하기가 어려워졌다. <br>
-> 따라서 compareTo()를 override하지 않고 "(국가 K보다 잘한 나라의 수)+1"이 등수이기 때문에 if문을 통해 국가 K보다 잘한 나라의 수를 세는 방법으로 구현하였다. <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/8979.kt)
</details>
<br>

<details>
<summary> # 1764 <code>Binary Search</code> <br> (https://www.acmicpc.net/problem/1764) </summary>
 -> 처음에는 듣도 못한 사람 N명을 입력받아 Array에 담고, 보도 못한 사람 M명을 입력받으면서 Array에서 같은 이름이 있는지 처음부터 끝까지 보면서 search하도록 구현하였다. <br>
-> 하지만 이렇게 구현하면 계속 시간초과가 나왔다. 어떻게 하면 search하는 시간을 줄일 수 있을지 찾아보다가 search하는데 logN만큼 걸리는 binary search를 이용하여 구현하였더니 문제를 맞출 수 있었다. <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/1764.kt)
</details>
<br>

<details>
<summary> # 3101 <br> (https://www.acmicpc.net/problem/3101) </summary>
-> 토끼가 이동하는 board의 숫자를 while문을 돌면서 미리 채워넣고 토끼가 이동하는 칸의 숫자를 더하도록 구현하였다. 하지만 이렇게 구현하였더니 '메모리 초과'가 떠서 다른 방법으로 구현해야 했다. <br>
-> 이번에는 칸에 숫자를 채워넣지 않고 좌표를 이용해서 해당 칸의 숫자를 알아내도록 구현하였다. 해당 칸의 숫자를 계산하는 method를 따로 만들어서 현재 토끼가 있는 좌표를 parameter로 넘겨주어서 이를 가지고 숫자를 계산하였다. 하지만 이번에는 '틀렸습니다'는 결과가 나왔다. <br>
-> 문제에서 32비트가 넘는 정수가 나올 수도 있다고 했는데 이를 간과하고 자료형을 Int로 구현하고 있었다. 따라서 칸의 숫자를 담는 변수와 숫자를 더한 값을 담는 변수의 자료형을 Long으로 바꿔주었다. 이번에는 '시간 초과'라는 결과가 나왔다. 이전에는 칸의 숫자를 계산하는 method에서 while문을 이용해서 숫자를 찾았는데 계산하는 시간을 줄이기 위해 간단한 수식으로 바꿨더니 문제를 맞출 수 있었다. <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/3101.kt)
</details>
<br>

<details>
<summary># 5567 <code>DFS</code> <br> (https://www.acmicpc.net/problem/5567) </summary>
-> graph를 이용해서 depth가 1이거나 2인 node를 찾아서 그 개수를 세도록 구현하였다. Node class를 만들어서 각 node의 number, depth, search했을 때 visit했는지, neighbor node에 대한 정보를 가지고 있도록 하였다. 그리고 stack을 이용하여 DFS search를 하고, depth가 2보다 크면 stack에 들어가지 않게 구현하였다. <br>
-> DFS search는 깊이 우선 탐색으로 graph를 search하는 방법 중 한 가지이다. 먼저 root node를 stack에 push하고 visit했다고 체크한다. 그 다음 stack에서 node 하나를 pop하고 그 node의 neighbor node들을 stack에 push한다. push한 node들은 visit했다고 체크해준다. 이를 stack이 empty일 때까지 반복한다. <br>
-> 처음에는 edge를 입력받을 때 작은 수부터 입력되기 때문에 작은 수의 node에 있는 neighbor 배열에만 add해서 directed graph가 되도록 만들었다. 하지만 문제에서 필요한 graph는 undirected graph이기 때문에 큰 수의 node에 있는 neighbor 배열에도 edge를 추가해줘서 문제를 맞출 수 있었다. <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/5567.kt)
</details>
<br>

<details>
<summary># 2751 <code>Merge Sort</code> <br>(https://www.acmicpc.net/problem/2751)</summary>
-> 라이브러리를 이용해서 sorting할 수 있지만 그렇지 않고 직접 sorting 알고리즘을 짜보았다. 여러 가지 sorting 알고리즘이 있지만 시간 제한이 있기 때문에 평균 O(nlogn)이 걸리는 merge sort로 구현하였다. <br>
-> merge sort는 문제를 작은 2개의 문제로 분리하고 각각을 해결한 다음, 결과를 모아서 원래의 문제를 해결하는 방법이다. 재귀함수를 이용하여 구현하였다. <br>
-> merge sort로 구현했어도 시간 초과가 나왔는데 println()을 BufferedWriter의 write() method로 바꿨더니 시간 초과가 뜨지 않았다. 이에 대해서 찾아본 결과, 자바에서도 println()이 느리기 때문에 성능에 영향을 많이 준다는 것을 알 수 있었다. 다음 링크를 보면 1부터 10,000,000까지의 자연수를 한 줄에 하나씩 출력하는 시간을 측정했을 때 println()은 30초나 걸리는 것을 볼 수 있다. (참고 : https://www.acmicpc.net/blog/view/57) <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/2751.kt)
</details>
<br>

<details>
<summary># 11650 <code>Merge Sort</code> <br>(https://www.acmicpc.net/problem/11650)</summary>
-> sort하는 것은 2751번 문제를 풀 때 사용한 merge sort 알고리즘으로 정렬하였다. 좌표이기 때문에 Pair class를 만들어서 x좌표와 y좌표를 가지고 있도록 구현하였다. <br>
-> sorting을 할 때 크기 비교를 해야되는데 class를 크기 비교하게 하기 위해서 인터페이스 Comparable을 implements하고 compareTo를 override해서 x좌표가 크면, x좌표가 같다면 y좌표가 큰 Pair가 크도록 구현하였다. <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/11650.kt)
</details>
<br>

<details>
<summary># 1406 <code>Linked List</code>&nbsp;<code>Stack</code> <br>(https://www.acmicpc.net/problem/1406)</summary>
-> 커서를 옮기면서 중간의 글자를 추가하거나 지울 수 있기 때문에 add, remove 하는데 걸리는 시간이 O(1)인 linkedlist를 이용해서 구현하려고 하였다. 처음에 구현했을 때는 index를 이용해서 add(index, char), removeAt(index)를 이용해서 중간의 글자를 추가하거나 지웠기 때문에 O(1)이 걸리는 것이 아니라 index까지 찾아가서 add나 remove를 하기 때문에 O(n)의 시간이 걸린다. 그래서 시간 초과로 문제를 풀 수 없었다. <br>
-> 이번에는 linkedlist의 listiterator를 이용해서 구현해보았다. (iterator도 있지만 iterator는 단방향으로만 갈 수 있기 때문에 양방향으로 이동할 수 있는 listiterator를 사용하였다.) iterator를 커서로 보고 명령을 수행하도록 구현하였지만 여전히 시간 초과가 떴다. 그래서 입출력의 시간을 최대한 줄이기 위해 Scanner 대신 BufferedReader로 입력을 받고, BufferedWriter로 출력을 했지만 그래도 시간 초과가 떴다. <br>
-> 문제에 대해 찾아보다가 stack으로도 풀 수 있다는 힌트를 얻었다. stack을 2개 만들어서 커서의 왼쪽에 있는 글자와 오른쪽의 글자를 나눠서 각각의 stack에 담았다. 그러면 add, remove를 O(1)만에 할 수 있다. 이렇게 구현하여 문제를 맞출 수 있었다.<br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/1406.kt)
</details>
<br>

<details>
<summary># 10824<br>(https://www.acmicpc.net/problem/10824)</summary>
-> 처음에는 주어진 예시(10 20 30 40)만 생각하고 첫번째, 세번째 숫자에 100을 곱해서 뒤에 숫자에 더해주게 구현하여서 문제를 틀렸었다. 다른 경우(예를 들어, 1343 34 463 34)를 보면 100을 곱해서 더하는 것은 당연히 답이 될 수 없다. 그래서 각 숫자를 string으로 입력받고 + 연산을 이용해서 2개를 붙인 후 toInt()로 int로 바꿔준 후 더하도록 구현하였다. 하지만 이번에는 런타임 에러가 났다. <br>
-> 문제의 조건을 보니 입력받는 숫자의 범위는 1 ≤ A, B, C, D ≤ 1,000,000 이므로 A와 B가 모두 1,000,000인 경우 합쳤을 때 10,000,001,000,000이 되는데 이는 int의 범위인 -2,147,483,648 ~ 2,147,483,647를 넘어서게 된다. (int는 4 byte == 32 bit이기 때문에 sign bit인 1 bit를 제외하면 2^31까지 담을 수 있다.) 따라서 8 byte 자료형인 long으로 바꿔주었더니 문제를 맞출 수 있었다. <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/10824.kt)
</details>
<br>

<details>
<summary># 1373<br>(https://www.acmicpc.net/problem/1373)</summary>
-> 2진수를 8진수로 바꾸기 위해서는 뒤에서부터 3bit씩 묶어서 계산해주면 된다. bit가 입력되는 순서와 계산하는 순서가 다르기 때문에 bit를 stack에 담아서 순서를 바꾼 후 3개씩 묶어서 계산하도록 하였다. bit의 수가 3으로 나누어 떨어지지 않아 뒤에 bit가 남는다면 남은 개수만큼만 계산하도록 마지막 묶음에 대한 분기를 나눠서 구현하였다. 다른 stack을 하나 더 할당하여 8진수로 계산한 수를 하나씩 stack에 담아서 pop하면서 출력하면 앞에서부터 계산한 것과 똑같이 출력이 된다. 이렇게 해서 문제를 맞출 수 있었지만 실행되는동안 입력되는 bit수만큼 loop를 여러 번 돌기 때문에 시간이 좀 오래걸렸다. <br>
-> 하지만 구글에서 다른 풀이를 찾아봤는데 대부분 stack을 이용하지 않고 문제를 풀었다. 다른 풀이에서는 3bit씩 묶어서 계산하기 때문에 입력되는 2진수의 bit 개수가 3의 배수가 아니라면 부족한 만큼 앞에 0을 채워넣어서 앞에서부터 3개씩 묶어서 계산하고 결과를 바로 출력하도록 구현하였다. 이 방법처럼 stack을 이용하지 않고 풀어보았더니 실행되는동안 bit 수만큼 한 번만 반복하기 때문에 전에 내가 구현했던 것보다 훨씬 짧은 시간만에 풀 수 있었다. <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/1373.kt)
</details>
<br>

<details>
<summary># 1212<br>(https://www.acmicpc.net/problem/1212)</summary>
-> 입력받은 8진수를 2진수로 바꾸기 위해 앞에서부터 차례대로 2진수로 바꾸고 출력하였다. while문으로 loop를 돌면서 4보다 크면 "100"으로 바꾸고 4를 빼고, 2보다 크면 string의 2번째 index의 글자를 1로 바꾸는 식으로 2진수로 바꾸었다. 맨 앞을 2진수로 바꿀 때, 앞에 있는 0들은 생략되어야하기 때문에 int로 바꿔서 출력되도록 하였다. <br>
-> 하지만 구글에서 찾은 다른 풀이들은 훨씬 간단하였다. 8진수이기 때문에 2진수로 바꾸는 경우가 8가지 밖에 없다. 따라서 나올 수 있는 2진수들을 미리 array에 담아놓고 8진수에 맞는 2진수를 출력하도록 구현할 수도 있었다. 이 풀이가 메모리도 훨씬 덜 필요하고 시간도 빠르게 문제를 풀 수 있었다.<br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/1212.kt)
</details>
<br>

<details>
<summary># 1929 <code>에라스토테네스의 체</code><br>(https://www.acmicpc.net/problem/1929)</summary>
-> 주어진 범위 내에 숫자들을 하나씩 보면서 소수인지 아닌지를 판별 후 출력하도록 하였다. 소수인지 판별하는 방법은 현재 체크하려는 수의 루트까지 나눠보면서 나누어떨어지는 수가 있다면 현재 체크하려는 수는 소수가 아니다라는 방법으로 하였다. <br>
-> 소수를 판별하는 데 이렇게 하나씩 나눠보는 방법보다 에라스토테네스의 체 방식을 이용해서 소수인지 아닌지를 판별하면 좀 더 빠르게 알 수 있다. 에라스토테네스의 체 방식은 최대 수 크기만큼의 Boolean 배열을 만들어놓고 모두 true로 초기화해놓는다. 우선, 1은 소수가 아니기 때문에 false로 해놓고 2부터 체크한다. Boolean 배열에서 2는 true이기 때문에 소수임을 확인하고 2의 배수들을 모두 false로 바꾼다. 배열에서 다음 true인 수를 찾아서 그 수가 소수임을 확인하고 해당 수의 배수들을 모두 false로 바꾼다. 이런 방식으로 false로 수들을 지워나가면 true인 수들이 소수가 된다. <br>
-> 에라스토테네스의 체 방식으로 구현하였더니 기존의 방식과 다르게 배열을 쓰기 때문에 메모리는 좀 더 필요하지만 시간은 훨씬 빠른 것을 알 수 있었다. <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/1929.kt)
</details>
<br>

<details>
<summary># 1463 <code>Dynamic Programming</code> <br>(https://www.acmicpc.net/problem/1463)</summary>
-> 이번 문제는 다이내믹 프로그래밍(DP)에 관한 문제였다. DP 문제는 처음 풀어보는 거라 어떻게 코드를 짜야될지 감이 오지 않았다. DP에 관해서 찾아보니 주로 배열을 이용하고, 작은 수일 때의 경우를 이용해서 큰 수일 때의 경우의 수를 찾는 것이었다. 따라서 각 수끼리의 규칙을 찾아 점화식을 만들어서 알고리즘을 짜는 것이었다. <br>
-> 문제의 규칙을 찾기 위해서 1부터 숫자를 하나씩 늘려가면서 최솟값을 찾아보았다. 하지만 최솟값이 나오는 경우가 여러 가지이고 규칙성을 찾기 어려웠다. 그래서 힌트를 찾아보았는데, 점화식은 생각보다 그렇게 어렵지 않았다. 최솟값을 찾는 것이기 때문에 해당 수보다 하나 작은 수일 때 케이스와 3으로 나눈 수일 때 케이스(혹은 2로 나눈 수일때 케이스) 중 min()을 이용해 최솟값을 찾아 넣으면 된다. <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/1463.kt)
</details>
<br>

<details>
<summary># 10844 <code>Dynamic Programming</code> <br>(https://www.acmicpc.net/problem/10844)</summary>
-> 이번 문제 역시 DP에 관한 문제였지만 이전 문제들과 달리 2차원 배열을 이용해서 푸는 문제였다. <br>
-> 배열 안에는 0~9로 끝나는 수의 개수를 넣어준다. 예를 들어, 세자리 숫자들 중 2로 끝나는 계단 수는 두자리 숫자들 중 2가 나올 수 있는 수로 끝난 수들을 더해주면 된다. 즉, 2로 끝나는 계단 수는 두자리 숫자들 중 1이나 3으로 끝나는 수들이 2로 끝나는 계단 수를 만들어낼 수 있다. <br>
-> 따라서 점화식은 dp[i][j] = dp[i-1][j-1] + dp[i-1][j+1] 로 할 수 있다. 문제의 최종 답은 dp[i==n]에 해당하는 배열의 수들을 모두 더해주면 된다. <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/10844.kt)
</details>
<br>

<details>
<summary># 9465 <code>Dynamic Programming</code> <br>(https://www.acmicpc.net/problem/9465)</summary>
-> 떼어낸 스티커의 주변 스티커는 못 쓰기 때문에 다음으로 떼어낼 스티커는 대각선 혹은 대각선의 오른쪽 스티커로 고를 수 있다. 따라서 스티커를 하나씩 보면서 현재 떼어낼 스티커의 왼쪽 대각선이나 왼쪽 대각선의 왼쪽 스티커의 숫자를 보고 더 큰 숫자를 골라 더해주는 식으로 점화식을 만들 수 있다. <br>
-> 처음에 Math class의 max()를 써서 최대값을 찾아냈는데 시간 초과가 나왔다. 따라서 max method를 만들어서 그 함수를 이용해 최대값을 찾도록 구현하였더니 시간 초과가 뜨지 않고 문제를 맞출 수 있었다. <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/9465.kt)
</details>
<br>

<details>
<summary># 1260 <code>DFS</code> <code>BFS</code> <br>(https://www.acmicpc.net/problem/1260)</summary>
-> 이번 문제는 DFS와 BFS를 구현하는 문제이다. graph를 입력받을 때, 2차원 배열을 이용하여 양방향 edge를 저장하였다. <br>
-> DFS는 stack을 이용하여 구현하였다. N+1 크기의 array를 만들어서 false로 초기화하여 방문을 하였는지 체크할 수 있도록 하였다. V에서 search를 시작해서 stack에서 pop하고 방문했다는 것을 체크하기 위해 array의 node에 해당하는 index를 true로 바꿔준다. 방문한 node에 인접한 node들을 (방문하지 않은 node라면) stack에 push한다. node의 번호가 작은 수부터 방문하기 위해 큰 수부터 push한다. stack이 empty할 때까지 반복한다. <br>
-> BFS는 DFS와 비슷하게 구현하였지만 queue를 이용한 점에서 차이가 있다. DFS에서와 마찬가지로 N+1 크기의 array를 만들고 V에서 search를 시작해서 queue에 remove하고 array의 node에 해당하는 index를 true로 바꿔준다. 방문한 node에 인접한 node들을 (방문하지 않은 node라면) queue에 add한다. 이를 queue가 empty할 때까지 반복한다. <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/1260.kt)
</details>
<br>

<details>
<summary># 1707 <code>DFS</code> <br>(https://www.acmicpc.net/problem/1707)</summary>
-> 이분 그래프는 각 node들이 인접한 node와의 색깔이 다르면 이분 그래프라고 할 수 있다. dfs로 모든 node들을 search하면서 color(1 or 2)를 주고 인접한 node가 현재 node와 색이 같다면 이분 그래프가 아니므로 NO를 출력하였다. <br>
-> dfs로 search할 때 node 중 1부터 시작하여 color를 칠했다. 하지만 계속 문제가 틀렸었다. 그 이유는 모든 node들이 이어져있지 않은 그래프도 존재하기 때문이었다. 이를 해결하기 위해 V까지의 node들을 보면서 방문하였는지 체크하는 코드를 추가하여 문제를 맞출 수 있었다. <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/1707.kt)
</details>
<br>

<details>
<summary># 9466 <code>DFS</code> <br>(https://www.acmicpc.net/problem/9466)</summary>
-> graph에서 cycle을 찾고 cycle에 포함되는 node의 수가 팀에 포함되는 학생 수이다. dfs를 이용하여 graph의 cycle을 찾았다. <br>
-> 전에는 stack을 이용하여 dfs를 구현하였지만 이번에는 재귀를 이용하여 dfs를 구현하였다. visit[]을 통해 방문한 node를 체크하고 done[]을 추가로 만들어서 팀에 포함된 학생들을 체크하였다. <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/9466.kt)
</details>
<br>

<details>
<summary># 2667 <code>BFS</code> <br>(https://www.acmicpc.net/problem/2667)</summary>
-> 2차원 배열을 입력받아 위,아래,왼쪽,오른쪽에 연결된 집을 찾아 단지의 개수와 한 단지 안에 포함된 집의 개수를 오름차순으로 출력하는 문제이다. 이번 문제는 bfs를 이용하여 풀 수 있었다. <br>
-> 2차원 배열을 하나씩 보면서 1인 곳을 찾으면 bfs()를 실행한다. bfs()에서는 맨 처음 1을 찾은 곳부터 시작해서 위,아래,왼쪽,오른쪽에 1이 있다면 queue에 add하여 queue의 맨 앞을 remove할 때마다 count를 하나씩 더하여 집의 개수를 return하였다. <br>
-> bfs()를 통해 얻은 집의 개수를 linkedlist에 add하여 linkedlist의 size가 단지의 개수를 알 수 있고, linklist를 sort하여 각 단지에 포함된 집의 개수를 오름차순으로 출력하여 문제를 맞출 수 있었다. <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/2667.kt)
</details>
<br>

<details>
<summary># 7576 <code>BFS</code> <br>(https://www.acmicpc.net/problem/7576)</summary>
-> graph를 처음부터 끝까지 보면서 1인 곳을 queue에 add하고 -1로 사방이 막혀있는 0이 있다면 토마토가 다 익지 못하는 상태이므로 -1을 return한다. 만약 queue에 아무것도 add되지 않았다면 익은 토마토가 없기 때문에 토마토가 다 익지 못하는 상태이므로 -1을 return한다. 그렇지 않으면 bfs()를 실행한다. bfs()가 한 번 실행될 때마다 day가 하루씩 늘어난다.<br>
-> bfs()는 인자로 받은 queue가 empty일 때까지 하나씩 remove하면서 remove된 곳 왼쪽,오른쪽,아래쪽,위쪽에 0이 있다면 1로 바꾸고 return할 queue에 add해준다. <br>
-> queue가 empty할 때까지 (즉, 익은 토마토 주변에 안 익은 토마토가 없을 때까지) bfs()를 실행한다. 그리고 다시 graph를 처음부터 끝까지 보면서 0이 있다면 -1을 return하고 그렇지 않으면 day를 return한다. <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/7576.kt)
</details>
<br>

<details>
<summary># 2178 <code>BFS</code> <br>(https://www.acmicpc.net/problem/2178)</summary>
-> 이전 문제와 같은 bfs문제였다. 따라서 이전 bfs 문제들과 비슷한 방법으로 풀었더니 문제를 맞출 수 있었다. <br>
-> 이전 문제들과 약간 다른 점은 Cell class를 만들어서 현재 위치의 (x,y)와 지금까지 몇 칸을 지나왔는지(move)를 멤버변수로 가지고 있도록 하였다. bfs로 (1,1)에서 시작하여 위,아래,오른쪽,왼쪽에 1이 있다면 현재 위치에서의 move+1를 하여 queue에 add하고 queue가 empty할 때까지 반복하였다. remove한 위치가 (n,m)이라면 현재의 move를 return하도록 구현하였다. <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/2178.kt)
</details>
<br>

<details>
<summary># 11725 <code>DFS</code> <br>(https://www.acmicpc.net/problem/11725)</summary>
-> 이번 문제는 각 node의 parent node를 찾는 문제이다. parent를 찾기 위해 dfs를 이용해서 문제를 풀었다. <br>
-> dfs로 graph를 search하면서 parent 배열을 만들어서 neighbor node를 stack에 push할 때 현재 방문한 node가 neighbor node의 parent node라고 저장해준다. <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/11725.kt)
</details>
<br>

<details>
<summary># 1967 <code>DFS</code> <br>(https://www.acmicpc.net/problem/1967)</summary>
-> 문제의 힌트로 bfs로 나와있어서 bfs 문제로 생각하고 풀이를 생각해보았지만 도저히 풀 수 없었다. 그래서 인터넷에서 풀이를 찾아봤는데 이번 문제는 bfs 문제가 아니라 dfs 문제라고 하였다. dfs를 두 번 써서 root에서 (즉 1에서) 제일 먼 node를 먼저 찾고, 그 node로부터 제일 먼 node를 찾으면 그게 트리의 지름이 될 것이다. 이것을 이용하여 문제를 풀 수 있었다. <br>
-> dfs를 스택을 이용해서 짜려고 했는데 root로부터 거리 계산이 어려웠다. 하지만 재귀를 이용해서 dfs를 짠다면 현재 visit한 node에서 parent로 돌아갔을 때 parent까지 왔던 거리를 알기가 더 쉬웠다. <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/1967.kt)
</details>
<br>

<details>
<summary># 2805 <code>Binary Search</code> <br>(https://www.acmicpc.net/problem/2805)</summary>
-> 이번 문제는 binary search를 이용해서 푸는 문제였다. 입력받을 때 나무들 중 제일 긴 나무의 길이를 알아내고 0부터 max까지 max부터 1씩 줄이면서 자르고자 하는 나무의 길이(m)과 제일 가까운 h를 찾으면 시간이 오래걸리므로 binary search를 하여 h를 찾아낸다. <br>
-> binary search를 하면서 m과 제일 가까운 h를 찾기 위해 min이라는 변수를 두어 나무들의 총 길이 합으로 초기화를 하고, 자른 나무의 길이와 m의 길이의 차가 제일 작은 h를 답으로 출력하였다. <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/2805.kt)
</details>
<br>

<details>
<summary># 10815 <code>Binary Search</code> <br>(https://www.acmicpc.net/problem/10815)</summary>
-> 이번 문제 역시 binary search를 이용해서 푸는 문제였다. 숫자 카드를 입력받을 때 ArrayList에 담아 binary serach를 위해 sort()를 해주었다. 그 다음, 숫자를 하나씩 입력받아 binary search를 하는 method를 만들어서 해당 수의 카드가 있다면 true를 return하여 1을 출력하고 그렇지 않으면 0을 출력하도록 구현하였다. <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/10815.kt)
</details>
<br>

<details>
<summary># 10816 <code>Binary Search</code> <br>(https://www.acmicpc.net/problem/10816)</summary>
-> 숫자 카드가 중복되어서 들어올 수 있고 해당 숫자의 카드가 몇 개 있는지 출력하는 문제이다. 따라서 입력을 받을 때 전에 입력받았던 숫자인지 체크하고 배열에 넣기 위해 HashMap을 이용하였다. key로 카드의 숫자를, value로 해당 카드의 개수를 가지고 있도록 하여 target을 찾아서 있는 카드라면 target에 해당하는 value를 출력하고 없으면 0을 출력하도록 하여 문제를 맞출 수 있었다. <br>
-> 하지만 힌트를 보니 이번 문제는 binary search에 해당하는 문제였다. 그래서 binary search로 다시 구현해보았다. ArrayList에 숫자들을 입력받고 sort()하여 오름차순으로 정렬하였다. target을 입력받아 target이 시작되는 index와 target이 끝나는 index+1을 binary search를 이용하여 찾고 그 둘을 빼면 target의 개수가 나온다. 만약 없는 카드라면, 시작되는 index와 끝나는 index+1이 같은 숫자로 return되기 때문에 0으로 출력된다. <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/10816.kt)
</details>
<br>

<details>
<summary># 2110 <code>Binary Search</code> <br>(https://www.acmicpc.net/problem/2110)</summary>
-> 집 간격 중 최소와 최대를 구하고 간격을 줄여가면서 공유기를 설치하도록 하였다. 하지만 이렇게 구현을 하면 최대 O(n)의 시간이 걸리기 때문에 이를 줄이기 위해 binary search를 이용해서 간격을 구하였다. <br>
-> 현재 보고 있는 간격(mid)을 구하고 mid보다 큰 간격에 있는 집에 공유기를 설치하고, 설치하고 싶은 수만큼 설치하지 못했다면 간격을 줄인다. 설치하고 싶은 수보다 적거나 같다면 간격의 max(문제의 답)을 현재 간격으로 바꾸고 간격을 조금 늘려보면서 search를 계속한다. <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/2110.kt)
</details>
<br>

<details>
<summary># 11728<br>(https://www.acmicpc.net/problem/11728)</summary>
-> 정렬된 두 배열을 하나로 합치면서 정렬하는 문제이다. 이전에 구현해보았던 merge sort 알고리즘 중에서 merge하는 코드와 비슷하게 구현하여 문제를 맞출 수 있었다.<br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/11728.kt)
</details>
<br>

<details>
<summary># 2875 <code>Greedy Algorithm</code> <br>(https://www.acmicpc.net/problem/2875)</summary>
-> 이번 문제는 greedy 알고리즘을 이용하여 푸는 문제이다. <br>
-> loop를 돌면서 여학생 수(N)과 남학생 수(M)에서 각각 2명, 1명을 빼고 남은 학생의 수가 인턴십에 참여하는 학생의 수(K)보다 많으면 팀을 만들 수 있으므로 팀 개수를 하나 늘린다. <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/2875.kt)
</details>
<br>

<details>
<summary># 1476<br>(https://www.acmicpc.net/problem/1476)</summary>
-> 입력받은 E, S, M가 year를 각 변수의 범위로 나눈 나머지이다. 따라서 각 범위로 % 연산을 하여 E, S, M가 나올 때까지 year를 하나씩 증가시켜준다. <br>
-> 나머지이므로 입력받은 수가 범위 중 가장 큰 수라면 나머지가 0이므로 각 변수를 0으로 바꿔주고 연산을 시작하였다. <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/1476.kt)
</details>
<br>

<details>
<summary># 11047 <code>Greedy Algorithm</code> <br>(https://www.acmicpc.net/problem/11047)</summary>
-> 이번 문제는 매 순간 최선의 선택을 하는 greedy 알고리즘 문제이다. <br>
-> N종류의 동전들 중 제일 큰 단위의 동전부터 보면서 만들고 싶은 금액(K)보다 작거나 같으면 최대한 금액을 만들 수 있는만큼 만들고 K가 단위보다 작아지면 더 작은 단위로 넘어간다. 이를 K가 0이 될 때까지 반복한다. <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/11047.kt)
</details>
<br>

<details>
<summary># 2146 <code>DFS</code> <br>(https://www.acmicpc.net/problem/2146)</summary>
-> 하나씩 입력된 지도를 살펴보면서 섬이 있는 곳(1인 곳)을 찾으면 그 지점부터 dfs를 시작하여 하나의 섬을 ArrayList에 담고, 다른 섬이 있을 수 있기 때문에 지도를 계속해서 살펴보고 1인 곳부터 dfs를 또 해준다. <br>
-> dfs() : 현재 보고 있는 지점의 동,서,남,북을 살펴보면서 1인 곳을 찾으면 stack에 push해주고 map에서 1->0으로 바꿔준다. 이를 stack이 empty일 때까지 반복하여 하나의 섬 return한다. <br>
-> dfs로 찾은 섬들을 ArrayList에 담아 섬들을 2개씩 묶어서 minBridge()를 실행한다. <br>
-> minBridge() : 섬과 섬 사이의 거리를 계산하고 그 중 최소 거리를 return한다. <br>
-> 이렇게 구현하였는데 42%에서 계속 틀렸습니다 가 나왔다. 그 이유는 섬과 섬 사이의 거리 중 최대값은 N일 것이라고 생각했기 때문이다. 하지만 (0,0)과 (N-1,N-1) 사이의 거리와 같이 N보다 큰 경우가 있었기 틀렸던 것이었다. <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/2146.kt)
</details>
<br>

<details>
<summary># 10610<br>(https://www.acmicpc.net/problem/10610)</summary>
-> 처음 접근방법은 입력되는 숫자를 String으로 받아서 하나씩 ArrayList에 담아 내림차순으로 sort를 한 후 큰 수부터 조합할 수 있는 모든 경우의 수들을 살펴보면서 30의 배수인 최대값을 찾으려고 하였다. <br>
-> 하지만 섞어서 만들 수 있는 숫자의 case들을 어떻게 구현해야할지에서 막혀서 여러 풀이들을 찾아보았다. 하지만 다른 분들의 풀이는 훨씬 간단하였다. <br>
-> 다른 풀이들은 우선 0이 하나라도 포함이 되어있는지 확인하고, 나머지 숫자들의 합이 3의 배수라는 조건에 모두 만족하여야 30의 배수로 만들 수 있다는 것을 이용하여 문제를 풀었다. <br>
-> 나도 이 풀이를 이용하여 우선 30의 배수를 만들 수 있는지 확인하였다. 만들 수 없다면 -1을 출력하고, 만들 수 있다면 ArrayList에 담은 각 자리의 숫자들을 sort()하여 맨 뒤에서부터 하나씩 출력하도록 구현하여 문제를 맞출 수 있었다. <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/10610.kt)
</details>
<br>

<details>
<summary># 1167 <code>DFS</code> <br>(https://www.acmicpc.net/problem/1167)</summary>
-> 처음에는 V개의 node들을 하나씩 root node로 보고 dfs()를 이용해서 각각 제일 긴 거리를 찾고 그 중 최대값을 출력하도록 하였다. 하지만 V가 클수록 시간이 더 걸리기 때문에 시간 초과가 나왔다. <br>
-> 그래서 모든 node들을 보는 것이 아니라 하나의 node에서 제일 멀리 있는 node를 찾고, 그 node에서 제일 멀리 있는 node까지의 거리를 찾으면 트리의 지름을 찾을 수 있다. <br>
-> dfs() : root에 선언해놓은 변수들(가장 멀리있는 node & 그 때의 distance)을 최대값으로 업데이트하고, neighbor node가 있다면 다음 node로 넘어가도록 recursive하게 구현하였다. <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/1167.kt)
</details>
<br>

<details>
<summary># 1654 <code>Binary Search</code> <br>(https://www.acmicpc.net/problem/1654)</summary>
-> 1부터 입력받은 랜선의 길이 중 제일 긴 길이 사이에 만들 수 있는 최대 랜선의 길이가 있다. 그렇기 때문에 범위 내에 있는 숫자들을 하나씩 보면서 조건에 맞는 수 중 제일 큰 수가 답이 된다. 하지만 하나씩 보면 시간 초과가 발생할 것이기 때문에 빠르게 search하기 위해 binary search를 이용하여 조건에 맞는 숫자를 찾았다. <br>
-> 처음에 문제를 제대로 읽지 않아 N개의 랜선을 만든 경우만 조건에 맞는 숫자라고 생각하여 틀렸었다. 하지만 문제에 N개보다 많이 만드는 것도 N개를 만드는 것에 포함된다고 쓰여있기 때문에 N개보다 많이 만드는 경우 중 제일 큰 수를 답으로 출력하였다. <br>
-> 다음으로 틀린 이유는 search하는 범위 때문이었다. 1부터 제일 긴 랜선의 길이가 범위라고 생각했지만 이렇게 하면 제일 긴 랜선의 길이가 답일 경우는 보지 못한다. 따라서 그 수도 포함시키기 위해 1~(max+1)까지로 범위를 하나 늘려주었다. <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/1654.kt)
</details>
<br>

<details>
<summary># 15653 <code>BFS</code> <br>(https://www.acmicpc.net/problem/15653)</summary>
-> 이번 문제는 bfs로 풀 수 있었다. node에 빨간 구슬의 위치와 파란 구슬의 위치를 담고 네 방향으로 기울이면서 구멍에 들어갈 수 있는 경우를 찾는다. 그리고 최소 횟수를 찾기 위해 방문했던 곳을 또 가면 안된다. 따라서 visited라는 4차원 배열을 이용하여 빨간 구슬과 파란 구슬이 왔었던 곳인지를 체크해주고 구슬을 굴렸을 때 방문하지 않았던 곳이라면 queue에 push한다. <br>
-> 굴렸을 때 파란 구슬이 구멍으로 들어가면 실패이기 때문에 search 도중 파란 구슬이 구멍에 들어간 경우가 된다면 바로 -1을 출력하도록 하여서 문제를 계속 틀렸었다. 하지만 이런 경우는 실패한 것이 아니라 이 방향으로 오는 것이 잘못되었다는 의미이므로 break가 아니라 continue로 바꿔서 문제를 맞출 수 있었다. <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/_15653.java)
</details>
<br>

<details>
<summary># 2636 <code>DFS</code> <br>(https://www.acmicpc.net/problem/2636)</summary>
-> 이번 문제 역시 dfs로 풀 수 있었다. 입력받은 2차원 배열을 돌면서 1인 칸이면 그곳부터 dfs를 시작하여 한 덩어리의 cheese를 볼 수 있었다. dfs()를 하면서 주변에 0이 있다면 바깥에 있는 cheese칸이라고 보고 0으로 바꾸고 녹을 cheese 개수를 +1 해서 이번 hour에 녹을 cheese의 개수를 return하였다. <br>
-> 이렇게 구현하였더니 녹을 cheese의 개수를 내가 생각한 것보다 더 많이 세어서 문제를 풀지 못하였다. 문제는 조건을 잘못 이해한 것이었다. cheese 중간에 구멍이 있기 때문에 주변에 0이 있다고 모두 녹을 cheese인 것은 아니었다. <br>
-> 이 조건을 만족시키기 위해 dfs를 한번 더 추가하여(: dfs_isAir() ), 항상 바깥쪽 공기인 (0,0) 칸과 연결된 칸을 찾아 visited라는 2차원 배열에서 -1로 표시하였다. 그리고 dfs를 한번 더 실행하여(: dfs_cheese() ) 녹을 cheese의 개수를 세어 return하였다. <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/_2636.java)
</details>
<br>

<details>
<summary># 10256 <code>Trie Algorithm</code> <br>(https://www.acmicpc.net/problem/10256)</summary>
-> marker가 되는 모든 경우에서 해당되는 문자열이 있는지 빠르게 찾기 위해 문자열 검색을 빠르게 할 수 있는 trie 알고리즘을 이용하였다. Trie class를 만들어서 children으로 다음 node들을 가지고 있도록 하였다. 문자가 A,C,G,T 밖에 없기 때문에 각 0,1,2,3으로 index를 정하여 children 배열에서 문자에 해당하는 index에 할당되도록 하였다. <br>
-> marker의 돌연변이가 될 수 있는 모든 경우를 찾아 Trie 안에 insert하였다. 그리고 search_DNA()로 DNA를 앞에서부터 marker의 길이만큼 보면서 해당 문자열이 marker가 되는 경우에 포함되는지 check하고, trie 안에 있다면 count를 +1해주어서 DNA 구조에 marker가 몇 번 출연하는지 return하였다. <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/_10256.java)
</details>
<br>

<details>
<summary># 18808<br>(https://www.acmicpc.net/problem/18808)</summary>
-> 이번 문제는 sticker를 주어진 칸에 붙이는 문제이다. sticker를 입력받을 때 1인 칸(스티커에 해당하는 칸)의 위치를 linkedList에 add하고 noteBook의 (0,0)부터 sticker를 붙일 수 있는지 attach() method를 이용하여 체크하고 붙일 수 있다면 list의 size만큼을 답에 더하고 다음 sticker로 넘어갔다. 만약 sticker를 붙일 수 없다면 spin90() method를 이용하여 sticker를 90도 돌리고 다시 attach() method로 붙일 수 있는지 check하였다. <br>
-> attach() : 재귀 함수로 구현하였고, noteBook의 범위 안에 들어가고 그 자리에 sticker가 붙어있지 않다면 다음 칸으로 넘어가서 다시 확인한다. 이렇게 모든 칸이 noteBook에 들어갈 수 있다면 noteBook의 위치를 1로 바꿔주고 true를 return하고, 그렇지 않다면 0으로 바꾸고 false로 return한다. <br>
-> spin90() : sticker를 90도 돌리는 method이다. sticker의 row와 column을 바꾼 크기의 Array를(change) 새로 할당하고 90도 돌린 결과를 change에 넣고 sticker에 change를 copy하였다. <br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/18808.kt)
</details>
<br>

<details>
<summary># 16957<br>(https://www.acmicpc.net/problem/16957)</summary>
-> 처음에는 규칙 그대로 수행하도록 구현하였다. 모든 칸을 차례대로 보면서 주의 8칸 숫자와 비교하여 현재 위치의 숫자보다 작고 작은 숫자들 중 제일 작은 수의 칸으로 이동한다. 그리고 주위에 현재 위치의 숫자보다 작은 수가 없다면 그곳에서 멈추기 때문에 공의 위치를 저장할 array(: boll)를 만들어 해당 위치에 +1을 하였다. <br>
-> 하지만 시간 초과가 떠서 좀 더 빠르게 공이 멈추는 위치를 찾아야 했다. 그래서 다이나믹 프로그래밍으로 구현해보았다. 체스판 안에 들어갈 수 있는 최대 수가 300000이므로 300001 크기의 배열(: dp)을 선언하고, 체스판의 칸에 있는 숫자를 index로 삼아 경로를 처음 갈 때 다음으로 넘어가는 위치를 배열에 넣어주었다. 따라서 이미 본 경로라면 주의 8칸을 일일이 보지 않고 dp array를 보고 한번에 다음 위치로 넘어가서 root를 찾아 root에 해당하는 위치에 boll array를 +1하였다. <br>
-> 하지만 이렇게 해도 시간 초과가 떴다. 따라서 root를 찾아가지 말고 이미 본 경로에 해당하는 index에 root 위치를 넣어주어서 한번에 root의 위치를 찾을 수 있도록 하였다. 이런 식으로 구현하였더니 시간 초과가 문제를 해결할 수 있었다.<br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/_16957.java)
</details>
<br>

<details>
<summary># 2473 <code>Binary Search</code> <br>(https://www.acmicpc.net/problem/2473)</summary>
-> 우선 입력받은 수를 배열에 넣고 merge sort를 해준다. 정렬된 array에서 3개를 뽑아 수의 합이 0에 제일 가까운 조합을 찾는다. <br>
-> 모든 경우를 하나씩 보면서 찾으면 최대 5000^3번을 봐야하므로 시간이 오래걸린다. 따라서 2개의 숫자를 고르고 나머지 하나를 binary search로 3개 수의 합이 0에 제일 가까운 조합을 찾는 방법으로 구현하였다. 이렇게 하면 최대 5000^2번만 보면 되므로 시간 내에 원하는 조합을 찾을 수 있다.<br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/_2473.java)
</details>
<br>

<details>
<summary># 1723 <code>Binary Search</code> <br>(https://www.acmicpc.net/problem/1723)</summary>
-> 중심각도가 같은 부채꼴 안에 들어가는 점의 최대 개수와 최소 개수의 차이 중 최솟값을 구하는 문제이다. 따라서 부채꼴을 만드는 방법은 여러 가지 있고 경우의 수를 줄이기 위해 입력받은 각도를 기준으로 부채꼴을 만들었다. <br>
-> 기준이 되는 각도에서 0.001을 뺀 값을 시작으로 중심 각도를 더해서 부채꼴을 만들고, 그 안에 들어가는 점의 개수를 찾기 위해 binary search를 이용하였다.<br>
(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/_1723.java)
</details>
<br>

<details>
	<summary># 1717 <code>union find</code> <br> (https://www.acmicpc.net/problem/1717)</summary>
	-> union()을 구현할 때 find()로 현재 집합의 대표값을 찾고 이미 같은 집합이 아니라면 둘을 합쳐주었다. 이렇게 구현하였더니 시간 초과가 발생하였다. <br>
	-> 시간 초과가 발생하는 이유는 그냥 합쳐주기만 했기 때문에 tree의 depth가 엄청 커질 수 있고 이렇게 되면 parent를 찾는데 O(n)의 시간이 걸리게 된다. 이를 해결하기 위해 두 개의 다른 tree의 depth를 비교해서 depth가 더 큰 tree의 대표값이 합친 tree의 대표값이 되도록 구현해주었다. <br>
	(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/1717.py)
</details>
<br>

<details>
	<summary># 3830 <code>union find</code> <br> (https://www.acmicpc.net/problem/3830)</summary>
	-> 두 샘플의 무게를 비교할 때 두 샘플이 연결되어있는지 확인하고 무게 차이를 edge에 weight로 주어서 graph를 search하는 방식으로 생각하였다. 그래서 처음에는 dfs로 구현하였다. 하지만 시간 초과가 나서 다른 알고리즘으로 문제를 풀었어야 했다. <br>
	-> 이번에는 union-find로 문제를 풀어보았다. findParent()를 통해 parent를 찾고, 재귀로 찾으면서 root를 tree array에 담았다. 그리고 weight array를 만들어서 root까지 가는 weight를 더해서 담는다. 그리고 union()에서는 같은 집합이 아닐 때 union을 진행한다. b의 parent를 대표값으로 하여 a와 b를 union하고, weight array에 입력받은 두 샘플의 차이에서 a의 weight와 b의 weight 차이를 빼서 a의 parent weight에 담는다. <br>
	(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/3830.py)
</details>
<br>

<details>
	<summary># 1644 <code>에라스토테네스의 체</code> <br> (https://www.acmicpc.net/problem/1644)</summary>
	-> 우선 입력값보다 작거나 같은 소수를 찾고 배열에 넣는다. 소수가 들어있는 배열을 0번째부터 보면서 현재의 index보다 큰 수들을 연속으로 더했을 때 입력값이 나오면 경우의 수에 해당하는 변수에 +1을 해주고, 입력값보다 커지면 바로 다음 index로 넘어가도록 구현하였다. <br>
	-> 처음에는 소수를 찾을 때 2부터 입력값의 루트값까지 보면서 나누어떨어지는지 하나씩 체크해보았다. 이렇게 구현했을 때도 통과했지만 Math.sqrt()를 써야해서 Math class를 쓰지 않고 소수를 찾기 위해 에라스토테네스의 체 방법으로 소수를 찾았다. 이 방법으로 구현했을 때의 시간이 처음에 제출했을 때의 시간보다 훨씬 덜 걸렸다. <br>
	(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/_1644.java)
</details>
<br>

<details>
	<summary># 14939 <br> (https://www.acmicpc.net/problem/14939)</summary>
	-> 우선, 최소로 스위치를 누르려면 모든 칸의 스위치를 최대 한번만 눌러야 한다. 그리고 첫번째 row에서의 전등이 정해지면 다음 row부터는 눌러야할 스위치가 정해지게 된다. 바로 윗칸의 전등이 켜져있을 때 해당 칸의 스위치를 누르면 되기 때문이다. 이런 식으로 첫번째 row에서 스위치를 누르는 모든 경우를 해보고, 전등이 모두 꺼지는 경우 중 가장 적게 누르는 횟수를 출력하도록 한다. <br>
	-> 첫번째 row의 스위치를 누르는 모든 경우를 해보기 위해 bit연산을 이용하였다. 스위치를 누르는 경우의 수는 10칸이기 때문에 2^10가지가 있고, bit 연산을 이용하여 모든 경우를 하나씩 해본다. 예를 들어, 현재 5(101)번째 case라면, 0번째 column과 2번째 column의 스위치를 flip해준다. <br>
	(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/_14939.java)
</details>
<br>

<details>
	<summary># 17090 <br> (https://www.acmicpc.net/problem/17090)</summary>
	-> 처음에는 dfs를 이용해서 해당 칸의 글자에 맞게 이동해서 탈출할 수 있는지 확인하고 이 행동을 모든 칸에서 반복하도록 구현하였다. 하지만 시간 초과가 떠서 다른 방법을 고민해야했다. <br>
	-> 따라서 union-find로 구현을 하였다. 해당 칸의 글자가 U라면 윗칸이랑 union하고 R이라면 오른쪽 칸과 union을 하는 식으로 이동하는 칸을 union하였다. 만약 union해야하는 칸이 maze 범위를 넘어가는 칸이라면 탈출할 수 있는 칸이므로 n*m과 union하여 탈출할 수 있는 칸이라고 구분하였다. <br>
	-> 모든 칸에 대해 union을 마친 후 해당 index의 parent가 n*m이라면 탈출할 수 있는 칸이라는 것을 알 수 있다. <br>
	(https://github.com/MunYeong0723/AlgorithmProblem/blob/master/Baekjoon/_17090.java)
</details>
<br>