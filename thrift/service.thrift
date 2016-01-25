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

struct JourneyThrift{
    1:i32 id
    2:i32 userId
    3:string origin
    4:string destination
    5:string tripMode
    6:i64 startDate
    7:i32 dayCount
    8:i32 partnerCount
    9:i32 hasMaleCount
    10:i32 hasFemaleCount
    11:i32 needMaleCount
    12:i32 needFemaleCount
    13:string detail
    14:i32 collectCount
    15:i32 upCount
    16:i32 shareCount
    17:i32 commentCount
    18:i32 status
    19:i64 createTime
    20:i64 updateTime
    21:i32 sexLimit
    22:i32 publicPhone
    23:i32 publicWechat
}

service OpenRpcThriftService{
    UserThrift login(1:string username, 2:string password);

  	i32 registe(1:string phone, 2:string password,  3:string nickname, 4:i32 sex, 5:string birthday, 6:string avatar);

    i32 publishJourney(1:JourneyThrift journey);

    JourneyThrift getJourney(1:i32 id);
}