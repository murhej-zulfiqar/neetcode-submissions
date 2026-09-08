class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {

        const map = new Map()
        for(let i=0;i<strs.length;i++){
            const hash = this.getStringHash(strs[i])
            let temp =[]
            if(map.has(hash)){
                temp = map.get(hash)
            }
            temp.push(strs[i])
            map.set(hash, temp)
        }
        const result = []
        map.forEach((value, key) => {
            result.push(value)
        })
        return result;
    }

    getStringHash (s){
        const letters = Array(26).fill(0);
        for(let i =0;i<s.length;i++){
            letters[s.charCodeAt(i) - 97]++
        }
        return letters.join(',')
    }
}
