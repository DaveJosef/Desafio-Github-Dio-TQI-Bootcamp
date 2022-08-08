import React from 'react';
import mock from '../mock';
import { List } from '../components/List';

export default function App() {
  
  return (
    <div>
      <List customers={mock}></List>
    </div>
  );
}
