import React, { useEffect, useState } from 'react';
import { ThemeContext, themes } from './Theme';
import Card from './Card';

function App() {
  const [token, setToken] = useState();

  useEffect(() => {
    setTimeout(() => {
      setToken('a4s3f5gjjkjiay7q289ghr4t6f');
    }, 4000);
  }, [setToken]);
  
  return (
    <ThemeContext.Provider value={{ ...themes.primary, token }}>
      <Card />
    </ThemeContext.Provider>
  );
}

export default App;
