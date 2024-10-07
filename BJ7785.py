n = int(input())
result = set()

for i in range(n):
    name, state = input().split()
    result.add(name)
    if state == "leave":
        result.remove(name)

result = sorted(result,reverse=True)

for i in result:
    print(i)
