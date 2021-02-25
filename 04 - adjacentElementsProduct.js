/*
Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

Example:

For inputArray = [3, 6, -2, -5, 7, 3], the output should be
adjacentElementsProduct(inputArray) = 21.

7 and 3 produce the largest product.
*/

//Array created and populated just to facilitate test. To use your own values just edit or comment this line.
let arr = [1,5,2,6,8,10];

// My solution (Using Javascript)
function adjacentElementsProduct(inputArray) {
    let i = 0;
    let auxVar = inputArray[i] * inputArray[i+1];
    
    while(i < inputArray.length){    
        if(inputArray[i] * inputArray[i+1] > auxVar){
            auxVar = inputArray[i] * inputArray[i+1];            
        }
        i++;
    }
    return auxVar;
}
//write the result at the page.
document.write(adjacentElementsProduct(arr));
