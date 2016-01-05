struct UserThrift{
  1:i32 id
  2:string username
  3:string nickname
  4:string phonenumber
  5:string email
  6:string password
  7:string realname
  8:i32 sex
  9:i64 birthday
  10:i32 level
  11:i32 nameAuth
  12:i32 emailAuth
  13:i32 phoneAuth
  14:i32 status
  15:i64 createTime
  16:i64 updateTime
  17:string avatarUrl
  18:string signature
  19:string province
  20:string city
  21:i32 followerCount
  22:i32 followningCount
}

service OpenRpcThriftService{
    UserThrift login(1:string username, 2:string password);

  	i32 registe(1:string phone, 2:string password,  3:string nickname, 4:i32 sex, 5:string birthday, 6:string avatar);
}