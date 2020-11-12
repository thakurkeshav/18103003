const christmasTree = (height, id) => {
    let strM = "";
    if (id === 1) {
        for (let i = 0; i < height; i++) {
            let str = '';
            for (let j = 1; j < height - i; j++) {
                str = str + ' ';
            }
            for (let k = 1; k <= (2 * i + 1); k++) {
                if (i == 0) str = str + '*';
                else str = str + '0';
            }
            strM += "\n";
            strM += str;
        }
        return strM;
    } else if (id === 2) {
        for (let i = 1; i < height; i++) {
            let str = '';
            for (let j = 1; j < height - i; j++) {
                str = str + ' ';
            }
            for (let k = 1; k <= (2 * i + 1); k++) {
                if (i == 0) str = str + '*';
                else str = str + '0';
            }
            strM += "\n";
            strM += str;
        }
        return strM;
    } else if (id === 3) {
        for (let i = 2; i < height; i++) {
            let str = '';
            for (let j = 1; j < height - i; j++) {
                str = str + ' ';
            }
            for (let k = 1; k <= (2 * i + 1); k++) {
                if (i == 0) str = str + '*';
                else str = str + '0';
            }
            strM += "\n";
            strM += str;
        }
        return strM;
    }
}
console.log(christmasTree(8, 1) + christmasTree(8, 2) + christmasTree(8, 3));