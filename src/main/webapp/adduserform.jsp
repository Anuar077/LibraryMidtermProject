<h3>Add Librarian</h3>
<form action="/adduserform" method="post" style="width:300px">
    <div class="form-group">
        <label for="name1">Login</label>
        <input type="text" class="form-control" name="name" id="name1" placeholder="Name"/>
    </div>
    <div class="form-group">
        <label for="email1">Email address</label>
        <input type="email" class="form-control" name="email" id="email1" placeholder="Email"/>
    </div>
    <div class="form-group">
        <label for="password1">Password</label>
        <input type="password" class="form-control" name="password" id="password1" placeholder="Password"/>
    </div>
    <div class="form-group">
        <%--@declare id="address"--%><label for="address">Address</label>
        <input type="address" class="form-control" name="address" id="address" placeholder="Address"/>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
