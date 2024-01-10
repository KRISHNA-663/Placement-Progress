t = int(input().strip())
for i in range(t):
    n,k = [int(temp) for temp in input().strip().split(' ')]
    c = [int(temp) for temp in input().strip().split(' ')]
    
    #k = 5 c = 1 2
    score = 0 
    for ctemp in c: 
        score ^= ctemp
        
    if score==0: 
        print("Second")
    else:
        print("First")