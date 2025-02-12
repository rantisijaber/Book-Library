document.getElementById("create").addEventListener("submit", async function(event) {
    event.preventDefault();
    console.log("form submitted")

    const title = document.getElementById("title").value;
    const author = document.getElementById("author").value;
    const publication = document.getElementById("publicationYear").value;
    console.log('Publication Year: ', publication);
    const book = {
        title,
        author,
        publication
    };
    console.log(book);

    try {
        const response = await fetch('/api/books/create', {
            method: 'POST',
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify(book)
        });

        if (response.ok) {
            const createdBook = await response.json();
            console.log('Book created: ', createdBook);
            document.getElementById("responseMessage").innerHTML = 'Book created Successfully!';
        } else {
            console.error('Failed to create book', response.status);
            document.getElementById("responseMessage").innerHTML = "Failed to create book :(";
        }
    } catch (error) {
        console.error('Error', error);
        document.getElementById("responseMessage").innerHTML = "Error creating the book";
    }
});