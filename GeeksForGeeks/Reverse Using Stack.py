def reverse(S):
    st=[]
    for i in S:
        st.append(i)
    ans=''
    while len(st):
        ans+=st.pop()
    return ans