function doSubmit(formName, nextUrl){
    document.forms[formName].action = nextUrl;
    document.forms[formName].submit();
}

