import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = sc.nextInt()
    var dp = Array(n+1){0}
    for(i in 1..n){
        if(i == 1) dp[i] = 1
        else if(i == 2) dp[i] = 3
        else{
            dp[i] = (dp[i-2]*2 + dp[i-1]) % 10007
        }
    }

    bw.write("${dp[n]}")
    bw.flush()
}