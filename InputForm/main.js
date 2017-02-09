var inputs = {
    checkbox: document.getElementById('invoiceChecked'),
    invoiceInput: document.getElementById('invoice'),
    clear: document.getElementById('clear'),
};

var showInvoiceInput = function() {
    if(inputs.checkbox.checked) {
        inputs.invoiceInput.style.display='block';
    } else {
        inputs.invoiceInput.style.display='none';
    }
}

var resetForm = function() {
    document.getElementById('webinar').reset();
    inputs.invoiceInput.style.display='none';
}







inputs.clear.addEventListener('click', resetForm);
inputs.checkbox.addEventListener('click', showInvoiceInput);
