n, k = map(int, input().split())

numbers = list(range(0, n + 1))
cnt = 0

for i in range(2, len(numbers)):
    if numbers[i]: # 소수인 경우
        for j in range(i, len(numbers), i): # 소수의 배수들을 모두 지워줌
            if numbers[j]: # 이미 지워진 수가 아닌 경우
                cnt += 1
                if cnt == k: # k번째 지워진 수
                    print(numbers[j])
                    exit()
                numbers[j] = 0
          