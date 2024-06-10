s=input()
alphabets=["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"]
for i in range(len(alphabets)):
    if alphabets[i]==s:
        print(alphabets[i+1])