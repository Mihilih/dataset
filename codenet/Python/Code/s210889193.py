
def solver():
	N = int(input())
	action = []
	for i in range(N):
		action.append(list(map(int, input().split())))

	dp = [[0 for _ in range(3)] for _ in range(N)]

	for i in range(3):
		dp[0][i] = action[0][i]

	for i in range(1,N):
		dp[i][0] = max(dp[i-1][1] + action[i][0], dp[i-1][2] + action[i][0])
		dp[i][1] = max(dp[i-1][0] + action[i][1], dp[i-1][2] + action[i][1])
		dp[i][2] = max(dp[i-1][0] + action[i][2], dp[i-1][1] + action[i][2])
	print(max(dp[N-1]))

solver()