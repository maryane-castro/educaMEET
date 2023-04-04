import React, { Fragment } from 'react';
import AvatarGroup from 'react-avatar-group';

const AvatarsComponent = () =>{
    const users = [
        {
          id: 1,
          name: 'Arthur',
          avatarUrl: 'https://avatars.githubusercontent.com/u/31219833?v=4',
        },
        {
          id: 2,
          name: 'Darlan',
          avatarUrl: 'https://avatars.githubusercontent.com/u/52115300?v=4',
        },
        {
          id: 3,
          name: 'Diego',
          avatarUrl: 'https://avatars.githubusercontent.com/u/115087435?v=4',
        },
      ];
      
    return(
        <Fragment>
            <AvatarGroup
            avatars={["James", "Amy", "Will", "John", "Maria" /* or IAvatar objects */]}
                initialCharacters={1}
                max={3}
                size={30}
                displayAllOnHover
                shadow={2}
            />
        </Fragment>
    )
}


export default AvatarsComponent;