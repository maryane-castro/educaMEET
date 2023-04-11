const authHeader = (authKey) => {
    return {headers: {
      'Content-Type': 'application/json',
      'Access-Control-Allow-Origin': '*',
      Authorization: authKey,
    },}
  }

export default authHeader;