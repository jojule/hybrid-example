import MainLayout from 'Frontend/views/MainLayout.js';
import { createBrowserRouter, RouteObject } from 'react-router-dom';
import Flow, { serverSideRoutes } from "Frontend/generated/flow/Flow";
import HillaView from './views/hilla/HillaView';

function AboutView() {

  return (<div>
    <p>This is a simplified example on how to mix:</p>
    <ul>
      <li>Hilla with React</li>
      <li>Flow in pure Java</li>
    </ul>
  </div>
  );
}

export const routes = [
  {
    element: <MainLayout />,
    handle: { title: 'Main' },
    children: [
      { path: '/', element: <AboutView /> },
      { path: '/hilla', element: <HillaView />, handle: { title: 'Hilla' } },
      ...serverSideRoutes
      // { path: '*', element: <Flow />, handle: { title: 'Flow' } }
    ],
  },
] as RouteObject[];


export default createBrowserRouter(routes);
