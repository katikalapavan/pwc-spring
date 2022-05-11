function getUser(id,cb){
    setTimeout(()=>{
        console.log('getting the users from all social platforms');
        cb({
            id:id,
            name:'king'
        })
    },1000);
}

function getBlogs(username,cb){
    setTimeout(()=>{
        console.log('getting the users from all social platforms');
        cb(['Post-1','Post-2','Post-3'])
    },1000);
}

function loadComments(post,cb){
    setTimeout(()=>{
        console.log('getting the users from all social platforms');
        cb(['comments for ' +post])
    },1000);
}
getUser(101,(user)=>{
    getBlogs(user.name,(blogs)=>{
        loadComments(blogs[0],(comments)=>{
            console.log(user,blogs[0],comments);
        })
    })
})
getUser(102,(user)=>{
    getBlogs(user.name,(blogs)=>{
        loadComments(blogs[1],(comments)=>{
            console.log(user,blogs[1],comments);
        })
    })
})
getUser(103,(user)=>{
    getBlogs(user.name,(blogs)=>{
        loadComments(blogs[2],(comments)=>{
            console.log(user,blogs[2],comments);
        })
    })
})