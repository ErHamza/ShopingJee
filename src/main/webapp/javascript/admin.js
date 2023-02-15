const addBtn = document.querySelector("#addBtn");
const modifyBtn = document.querySelector("#modifyBtn");
const statsBtn = document.querySelector("#statsBtn");

const addProduct = document.querySelector("#add_product");
const modifyPrice = document.querySelector("#modify_price");
const showStats = document.querySelector("#show_stats");

addBtn.addEventListener("click", function() {
    addProduct.style.display = "block";
    modifyPrice.style.display = "none";
    showStats.style.display = "none";
});

modifyBtn.addEventListener("click", function() {
    addProduct.style.display = "none";
    modifyPrice.style.display = "block";
    showStats.style.display = "none";
});

statsBtn.addEventListener("click", function() {
    addProduct.style.display = "none";
    modifyPrice.style.display = "none";
    showStats.style.display = "block";
});



console.log("dd")