#순열

from itertools import permutations

data = ['a','b','c']

result = list(permutations(data,3))
print("순열")
print(result)

#조합
from itertools import combinations

result = list(combinations(data,2))
print("조합")
print(result)

#중복 순열
from itertools import product

result = list(product(data, repeat=3))
print("중복 순열")
print(result)

#중복 조합
from itertools import combinations_with_replacement

result = list(combinations_with_replacement(data,2))
print("중복 조합")
print(result)
