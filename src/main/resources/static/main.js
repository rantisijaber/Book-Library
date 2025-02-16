const createForm = document.getElementById("create");
if (createForm) {
    createForm.addEventListener("submit", async function(event) {
        event.preventDefault();

        const title = document.getElementById("title").value;
        const author = document.getElementById("author").value;
        const publication = document.getElementById("publicationYear").value;
        const book = { title, author, publication };

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
}

updatePage = document.getElementById("update");
if (updatePage) {
    updatePage.addEventListener("submit", async function(event) {
        event.preventDefault();

        const id = document.getElementById('idUpdate').value;
        const title = document.getElementById('titleUpdate').value;
        const author = document.getElementById('authorUpdate').value;
        const publication = document.getElementById('publicationYearUpdate').value;

        const book = {
            id, title, author, publication
        };

        try {
            const response = await fetch(`/api/books/${id}`, {
                method : 'PUT',
                headers : {'Content-Type' : 'application/json'},
                body : JSON.stringify(book)
            });

            if (response.ok) {
                document.getElementById('responseMessageUpdate').innerHTML = 'Book updated successfully!'

            } else {
                console.error('Failed to create book', response.status);
                document.getElementById("responseMessageUpdate").innerHTML = 'Failed to update book :(';
            }
        } catch (error) {
            console.log('Error: ', error);
            document.getElementById('responseMessageUpdate').innerHTML = 'Error occurred';


        }
    });}

const deletePage = document.getElementById("deleteForm");

if (deletePage) {
    deletePage.addEventListener('submit', async function(event){
        event.preventDefault();

        const id = document.getElementById('idDelete').value;

        try {
            const response = await fetch(`/api/books/delete/${id}`,{
                method : 'DELETE',
                headers : {'Content-Type' : 'application/json'}
            });

            if (response.ok) {
                document.getElementById('responseMessageDelete').innerHTML = 'Book Deleted Successfully';
            } else {
                document.getElementById('responseMessageDelete').innerHTML = 'Book was not deleted, ID was not found';
            }

        } catch (error) {
            document.getElementById('responseMessageDelete').innerHTML = 'Error deleting book' + error;

        }
    });


}