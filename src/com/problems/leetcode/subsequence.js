/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isSubsequence = function (s, t) {

    let i = 0; //  this denote the s
    let j = 0; // this denote for t

    while (j < t.length) {

        if (s[i] == t[j]) {
            i++;
        }


        if (i === s.length) return true;

        j++;
    }

    return i === s.length;

    // Alternate solution
    // let l=0;
    // for(let i=0;i<t.length;i++){
    //     if(t[i]===s[l]){
    //         l++;
    //     }
    // }
    // return s.length===l?true:false;


};


const s = 'b';
const t = 'abc';

console.log(isSubsequence(s, t));
