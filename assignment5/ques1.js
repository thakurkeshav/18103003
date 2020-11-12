let i = 1;
const count = () => {
    console.log(i);
}

const id = setInterval(() => {
    count();
    ++i;

    if (i === 11 || i === 21 || i === 31 || i === 41 || i === 51 || i === 61 || i === 71 || i === 81 || i === 91 || i === 101) {
        console.log("ohh " + (i - 1) + " second passed");
    }
    if (i === 101) {
        clearInterval(id);
    }
}, 1000);
