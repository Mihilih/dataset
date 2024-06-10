import copy
def solve():
    S_d = list(input())
    T = list(input())

    end = len(S_d) - 1
    first = end - len(T) + 1
    while first >= 0:
        t_i = 0 
        for s_i in range(first, end+1):
            if T[t_i] != S_d[s_i] and S_d[s_i] != '?':
                break
            t_i += 1
        else:
            break

        first -= 1
        end -= 1

    else:
        print('UNRESTORABLE')
        exit(0)
    
    ans = copy.deepcopy(S_d)
    t_i = 0
    for i in range(first, end+1):
        ans[i] = T[t_i]
        t_i += 1
    
    ans = ''.join(ans).replace('?','a')
    print(ans)

if __name__ == '__main__':
    solve()