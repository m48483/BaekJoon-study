n, m = map(int, input().split())

a = set()
for i in range(n):
    a.add(input())
b = set()
for i in range(m):
    b.add(input())

result=[]
for i in a:
    if i in b:
        result.append(i)

result.sort()
print(len(result))
for i in result:
    print(i)
