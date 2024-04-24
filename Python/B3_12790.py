# 12790 Mini Fantasy War
t = int(input())
for _ in range(t):
    hp, mp, attack, defense, one, two, three, four = map(int, input().split())
    hp += one
    mp += two
    attack += three
    defense += four
    if hp < 1:
        hp = 1
    if mp < 1:
        mp = 1
    if attack < 0:
        attack = 0
    res = 1 * hp + 5 * mp + 2 * attack + 2 * defense
    print(res)