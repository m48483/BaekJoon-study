n = int(input())

now = list(map(int, input()))
want = list(map(int, input()))

def change(A, B):
    tmp = A[:]
    cnt = 0
    for i in range(1,n):
        if tmp[i-1]!=B[i-1]:
            cnt+=1
            for j in range(i-1,i+2):
                if j<n:
                    tmp[j]= 1-tmp[j]

    if tmp == B:
        return cnt
    else:
        return 1e9

res = change(now, want)

now[0] = 1-now[0]
now[1] = 1-now[1]

res = min(res, change(now, want)+1)
if res!=1e9:
    print(res)
else:
    print(-1)
