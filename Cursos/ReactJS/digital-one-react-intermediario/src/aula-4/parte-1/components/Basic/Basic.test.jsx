import React from "react";
import { render } from '@testing-library/react';
import '@testing-library/jest-dom/extend-expect';
import Basic from "./Basic";

describe('Testando Basic', () => {
    it('O component Basic deve renderizar corretamente', () => {
        const { baseElement } = render(<Basic name='Lilith' />);
        expect(baseElement).toHaveTextContent('Meu nome é Lilith');
    })
});
