import React from 'react';
import styled from 'styled-components';

const ClassRoom = styled.div`
`;

const ClassRoomControls = styled.div`
`;

const ClassRoomBoard = styled.div`
`;

export const Aula1 = () => {
  return (
    <ClassRoom>
        <ClassRoomControls>
            <button>Tópico 1</button>
            <button>Tópico 2</button>
            <button>Tópico 3</button>
        </ClassRoomControls>
        <ClassRoomBoard></ClassRoomBoard>
    </ClassRoom>
  )
}
