const form = document.querySelector("form");
const nextBtn = form.querySelector(".nextBtn");
const backBtn = form.querySelector(".backBtn");
const allInput = form.querySelectorAll(".first input");


nextBtn.addEventListener("click", ()=> {    
    form.classList.add("secActive");

    // allInput.forEach(input => {
    //     if(input.value != ""){
    //         form.classList.add("secActive");
    //     }else{
    //         form.classList.remove("secActive");
    //     }
    // })
})

backBtn.addEventListener("click", () => form.classList.remove('secActive'));