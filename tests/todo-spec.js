describe('book-shelf homepage book list', function() {
  it('should add a book', function() {
  	browser.ignoreSynchronization = true;

    browser.get('http://localhost:9080/book/books');
	
	var link = element(by.css('a[href*="/book/shop-cart/1"]'));
    expect(link.isDisplayed()).toBe(true);

    var cart = element(by.css('a[href*="/book/shop-cart/cart-list"]'));
    //expect(cart).toEqual(9);

    var elm = element(by.id('cartSize'));

	elm.getAttribute('value').then(function (value) {
	    console.log(value);
	});

  });
});